public class Detail {
    private String countryName;
  private   String countryCapital;
   private char region;
   private char language;

    private String getCountryName() {
        return countryName;
    }

    private void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private String getCountryCapital() {
        return countryCapital;
    }

    private void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    private char getRegion() {
        return region;
    }

    private void setRegion(char region) {
        this.region = region;
    }

    private char getLanguage() {
        return language;
    }

    private void setLanguage(char language) {
        this.language = language;
    }
}
