package CustomClass.OfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        Offer offer2= new Offer();
        offer1.setInfo("VA","Dunder Mifflin","QA",123.500,true,false,true);
        offer2.setInfo("ca","asur","sdet",123.500,false,false,false);

            Offer []myOffers={offer1,offer2};
        System.out.println(Arrays.toString(myOffers));
        ArrayList<Offer>fullTimeOffers= new ArrayList<>();

        fullTimeOffers.addAll(Arrays.asList(offer1,offer2));


        fullTimeOffers.removeIf(p->p.isFullTime==false);
        System.out.println(fullTimeOffers);

    }


}
/*2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary*/