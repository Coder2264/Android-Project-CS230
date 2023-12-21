class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Handle received message here
    }

    override fun onNewToken(token: String) {
        // Handle token refresh here
    }
}