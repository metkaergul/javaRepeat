package CustomClass.OfferTask;

public class Offer {


public String location,companyName,jobTitle;
public double salary;
public boolean hasBenefit,hasPTO,isFullTime;

public void setInfo(String location,String companyName,String jobTitle,double salary,boolean hasBenefit,boolean hasPTO,boolean isFullTime){
    this.location=location;
    this.companyName=companyName;
    this.jobTitle=jobTitle;
    this.salary=salary;
    this.hasBenefit=hasBenefit;
    this.hasPTO=hasPTO;
    this.isFullTime=isFullTime;

}

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object
*/