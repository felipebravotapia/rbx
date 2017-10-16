package ubox.etec.com.rumbox;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import org.json.JSONException;
import org.json.JSONObject;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String LOGTAG = "android-fcm";
    static JSONObject object = null;
    public String imei = "";
    public String patente = "";
    public String token = "";
    String titulo = "";
    String texto = "";
    String datos_vehiculo = "";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if (remoteMessage.getNotification() != null) {

            String titulo = remoteMessage.getNotification().getTitle();
            String texto = remoteMessage.getNotification().getBody();



            Log.d(LOGTAG, "NOTIFICACION RECIBIDA");
            Log.d(LOGTAG, "Título: " + titulo);
            Log.d(LOGTAG, "Texto: " + texto);

            if(remoteMessage.getData().size()>0){
                Log.d(LOGTAG, "DATA: " + remoteMessage.getData());
            }

            //Opcional: mostramos la notificación en la barra de estado
            showNotification(titulo, texto);

//            MainActivity a = new MainActivity();
            // a.escribirmensaje(remoteMessage.getData()+"");
        }
    }

    private void showNotification(String title, String text) {

        Intent intent = new Intent(this, Menu_principal.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 , intent, PendingIntent.FLAG_ONE_SHOT);

        Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(android.R.mipmap.sym_def_app_icon)
                        .setContentTitle(title)
                        //.setAutoCancel(true)
                        .setSound(soundUri)
                        .setContentText(text)
                        .setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());
    }
}
