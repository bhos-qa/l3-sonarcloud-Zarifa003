import org.example.PermissionLevel;
import org.example.PermissionManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionTest {
    @Test
    public void testGetRoleName() {
        PermissionManager manager = new PermissionManager();
        assertEquals("Admin", manager.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", manager.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", manager.getRoleName(PermissionLevel.USER));
    }

    @Test
    public void testSetPermissionLevel() {
        PermissionManager manager = new PermissionManager();
        manager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, manager.getCurrentLevel());
    }

}