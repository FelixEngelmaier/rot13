package at.engelmaier.swlcm.rot13.controllers;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Locale;

@Path("/api/rot13/")
public class Rot13Controller {

    private static final int delta = 13;

    @GET
    @Path("/{sourceString}")
    @Produces(MediaType.TEXT_PLAIN)
    public static String getRot13StringFromSourceString(@PathParam("sourceString") String sourceString) {
        StringBuffer returnValue = new StringBuffer(sourceString);
        for (int i = 0; i < returnValue.length(); i++) {
            int c = returnValue.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                returnValue.setCharAt(i, (char) (remove26IfHigher(c - 'A' + delta) + 'A'));
            } else if (c >= 'a' && c <= 'z') {
                returnValue.setCharAt(i, (char) (remove26IfHigher(c - 'a' + delta) + 'a'));
            }
        }
        return returnValue.toString();
    }

    private static int remove26IfHigher(int c) {
        if (c > 26) {
            c = c - 26;
        }
        return c;
    }
}
