import java.util.ArrayList;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String LicenseNumber) {
        this.liNumber = LicenseNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return this.country + " " + liNumber;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(!(other instanceof LicensePlate)) {
            return false;
        }

        LicensePlate otherLiPlate = (LicensePlate) other;
        return liNumber.equals(otherLiPlate.liNumber) && country.equals(otherLiPlate.country);
    }

    @Override
    public int hashCode() {
        String[] parts = liNumber.split("-");
        int sum = 0;
        for (int i = 0; i < parts[1].length(); i++) {
            sum += Integer.parseInt(String.valueOf(parts[1].charAt(i)));
        }
        sum += liNumber.length() + country.length();
        return sum;
    }
}
