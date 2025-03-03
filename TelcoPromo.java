public class TelcoPromo {
    public static void main(String[] args) {
        Telco smart = new Telco(15, 399, "Smart", false);
        Telco globe = new Telco(10, 299, "Globe", true);
        Telco ditto = new Telco(8, 229, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer: " + smart.accept(promo, smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer: " + globe.accept(promo, globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer: " + ditto.accept(promo, ditto.getPromoPrice()));

        System.out.println("\nSmart Unlimited Calls & Texts: " + smart.accept(unli, smart.getUnliCallText()));
        System.out.println("Globe Unlimited Calls & Texts: " + globe.accept(unli, globe.getUnliCallText()));
        System.out.println("Ditto Unlimited Calls & Texts: " + ditto.accept(unli, ditto.getUnliCallText()));
    }
}
