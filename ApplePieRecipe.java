public class ApplePieRecipe {

    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter" );
    Ingredient sugar = new Ingredient(200, "gram", "witte bastard suiker" );
    Ingredient bakingSoda = new Ingredient(400, "gram", "zelfrijzend bakmeel" );
    Ingredient egg = new Ingredient(1, "stuks", "ei" );
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker" );
    Ingredient salt = new Ingredient(1, "snuf", "zout" );
    Ingredient apple = new Ingredient(1.5, "kilo", "zoetzure appels" );
    Ingredient cristalSugar = new Ingredient(75, "gram", "kristal suiker" );
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel" );
    Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel" );



    public void printIngredients(){
        System.out.println("Ingredienten nodig voor dit recept: ");
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println(bakingSoda.getAmount() + " " + bakingSoda.getUnit() + " " + bakingSoda.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apple.getAmount() + " " + apple.getUnit() + " " + apple.getName());
        System.out.println(cristalSugar.getAmount() + " " + cristalSugar.getUnit() + " " + cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }

    public void printSteps(){
        preHeatOven();
        mixEgg();
        mixIngredients();
        cutApple();
        greeceBakingTray();
        putDoughInTray();
        putAppleInTray();
        cutDough();
        excessDoughOnPie();
        putPieInOven();
    }

    public void preHeatOven(){
        System.out.println("1: Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void mixEgg(){
        System.out.println("2: Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixIngredients(){
        System.out.println("3: Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }


    public void cutApple(){
        System.out.println("4: Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greeceBakingTray(){
        System.out.println("5: Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void putDoughInTray(){
        System.out.println("6: Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void putAppleInTray(){
        System.out.println("7: Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void cutDough(){
        System.out.println("8: Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void excessDoughOnPie(){
        System.out.println("9: Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void putPieInOven(){
        System.out.println("10: Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}
