package com.example.tp2_broadcastreceiver;

import static android.content.Intent.ACTION_USER_PRESENT;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class UnlockReceiver extends BroadcastReceiver {
    private final String NUM = "tel:2664553747";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(ACTION_USER_PRESENT)) {
            Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_SHORT).show();
            Log.d("Desbloqueo", "Se produjo el evento de desbloqueo");

            Intent call = new Intent(Intent.ACTION_DIAL);

            call.setData(Uri.parse(NUM));

            call.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(call);
        }
    }
}
