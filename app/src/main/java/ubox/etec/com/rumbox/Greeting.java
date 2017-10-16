package ubox.etec.com.rumbox;

/**
 * Created by Felipe on 21-03-2016.
 */
public class Greeting {

    private String tag;
    private String data;
    private String name;
    private String auth;
    private String message;
    public String token;
    private String mensaje;
    public String estado;
    public String id_usuario;
    public String us_username;
    public String Lat;
    public String Lon;
    public String cmd;

    public String getUs_username() {return us_username;}

    public void setUs_username(String us_username) {this.us_username = us_username;}

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getLat() {
        return Lat;
    }

    public String getLon() {
        return Lon;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String gettag() {
        return this.tag;
    }

    public String getdata() {
        return this.data;
    }

    public String getname() {return this.name;}

    public String getauth() {
        return this.auth;
    }

    public String getmessage() {
        return this.message;
    }

    public String gettoken() {
        return this.token;
    }

    public String getmensaje() {
        return this.mensaje;
    }

    public String getestado() {
        return this.estado;
    }

    public String getid_usuario() {return this.id_usuario;}


}
