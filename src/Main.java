class Main {
    public static void main(String[] args){
        UserManager userManager = new UserManager();
        userManager.laadGebruikers();
        Security security = new Security(userManager);
        Menu menu = new Menu();
        menu.startMenu(security);
        userManager.SlaGebruikersOp();
    }
}
