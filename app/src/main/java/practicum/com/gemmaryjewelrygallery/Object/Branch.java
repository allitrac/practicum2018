package practicum.com.gemmaryjewelrygallery.Object;

public class Branch {

    private String branchName;
    private String branchProvince;
    private String branchAddress;

    public Branch(){

    }

    public Branch(String branchName, String branchProvince, String branchAddress) {
        this.branchName = branchName;
        this.branchProvince = branchProvince;
        this.branchAddress = branchAddress;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchProvince() {
        return branchProvince;
    }

    public void setBranchProvince(String branchProvince) {
        this.branchProvince = branchProvince;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
