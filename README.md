# BroadcastReceiveTP2 - Desbloqueo de pantalla

La aplicación escucha un evento del sistema: el **desbloqueo de pantalla** (`Intent.ACTION_USER_PRESENT`). Cuando este evento ocurre, la app realiza las siguientes acciones de forma automática:
1.  Muestra un mensaje `Toast` en pantalla indicando: "Pantalla desbloqueada detectada".
2.  Registra en el `Logcat` del sistema que el evento de desbloqueo ha sido capturado correctamente.
3.  Genera un `Intent implícito` que abre la aplicación de llamadas con el número telefónico: `2664553747`.

---
### 👥 Integrantes del Grupo
* **Suarez, Tomas Agustin** - DNI: `44.642.586`
---