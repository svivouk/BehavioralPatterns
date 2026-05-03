package chainofresponsibility;

public record User(String userRole, boolean isAuthenticated, String resourceOwnerId, String currentUserId) {
}
