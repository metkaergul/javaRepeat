package CustomMethods.voidReturnType;

public class EligibleToVote {

    public static void main(String[] args) {

eligibleToVote(19,"russia");
    }

    public static void eligibleToVote(int age,String citizenShip){

        if(age>18&&citizenShip.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote!");
        }

    }


}
/*create a method that an check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


		*/