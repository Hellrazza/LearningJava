import org.junit.Test;

import static org.junit.Assert.*;

public class EqualsTest {
    @Test
    public void SimpleDateTestNewTrue() {
        SimpleDate d = new SimpleDate(1,2,1999);
        assertEquals(new SimpleDate(1, 2, 1999), d);
    }

    @Test
    public void SimpleDateTestSameTrue() {
        SimpleDate d = new SimpleDate(1, 2, 1999);
        assertEquals(d, d);
    }

    @Test
    public void SimpleDateTestFalse() {
        SimpleDate d = new SimpleDate(1, 2, 1999);
        assertNotEquals(new SimpleDate(26, 1, 1999), d);
    }

    @Test
    public void RegistryAddSuccess() {
        VehicleRegistry vr = new VehicleRegistry();
        assertTrue(vr.add(new LicensePlate("BR","ABC-123"),"Ryan"));
    }

    @Test
    public void RegistryAddFail() {
        VehicleRegistry vr = new VehicleRegistry();
        vr.add(new LicensePlate("BR", "ABC-123"), "Ryan");
        assertFalse(vr.add(new LicensePlate("BR", "ABC-123"), "Bob"));
    }

    @Test
    public void RegistryGetSuccess() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        vr.add(lc1, "Ryan");
        assertEquals("Ryan", vr.get(lc1));
    }

    @Test
    public void RegistryGetFailWrongName() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        vr.add(lc1, "Ryan");
        assertNotEquals("John", vr.get(lc1));
    }
    @Test
    public void RegistryGetFailDoesNotExist() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        assertNotEquals("Ryan", vr.get(lc1));
    }

    @Test
    public void RegistryRemoveSuccess() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        vr.add(lc1,"Ryan");
        assertTrue(vr.remove(lc1));
    }

    @Test
    public void RegistryRemoveFail() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        assertFalse(vr.remove(lc1));
    }

    @Test
    public void RegistryPrintLicensePlates() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        LicensePlate lc2 = new LicensePlate("FR", "BCD-234");
        LicensePlate lc3 = new LicensePlate("DU", "CDE-345");

        vr.add(lc1, "Ryan");
        vr.add(lc2, "Michael");
        vr.add(lc3, "Stan");

        vr.printLicensePlates();
    }

    @Test
    public void RegistryPrintOwners() {
        VehicleRegistry vr = new VehicleRegistry();
        LicensePlate lc1 = new LicensePlate("BR", "ABC-123");
        LicensePlate lc2 = new LicensePlate("FR", "BCD-234");
        LicensePlate lc3 = new LicensePlate("DU", "CDE-345");

        vr.add(lc1, "Ryan");
        vr.add(lc2, "Ryan");
        vr.add(lc3, "Stan");

        vr.printOwners();
    }
}
