package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;
    public String getRoleName(PermissionLevel Level) {
        switch (Level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown";
        }
    }

    public void setPermissionLevel(PermissionLevel Level) {
        this.mCurrentLevel = Level;
    }
    public PermissionLevel getCurrentLevel() {
        return mCurrentLevel;
    }
}