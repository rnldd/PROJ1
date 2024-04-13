import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vraag {
    private String vraagTekst;

    public Vraag(String vraagTekst) {
        this.vraagTekst = vraagTekst;
    }

    public String getVraagTekst() {
        return vraagTekst;
    }

    public void weergeven() {
        System.out.println(vraagTekst);
    }

    public boolean isOpen() {
        return false;
    }
}

class MeerkeuzeVraag {
    private List<String> opties;

    public MeerkeuzeVraag(String vraagTekst, List<String> opties) {
        super(vraagTekst);
        this.opties = opties;
    }

    public List<String> getOpties() {
        return opties;
    }

    @Override
    public void weergeven() {
        super.weergeven();
        for (int i = 0; i < opties.size(); i++) {
            System.out.println((i + 1) + ". " + opties.get(i));
        }
    }

    @Override
    public boolean isOpen() {
        return false;
    }
}

class OpenVraag {
    public OpenVraag(String vraagTekst) {
        super(vraagTekst);
    }

    @Override
    public boolean isOpen() {
        return true;
    }
}

class ConditioneleVraag {
    private String conditieOptie;
    private Vraag vervolgVraag;

    public ConditioneleVraag(String vraagTekst, String conditieOptie, Vraag vervolgVraag) {
        super(vraagTekst);
        this.conditieOptie = conditieOptie;
        this.vervolgVraag = vervolgVraag;
    }

    public String getConditieOptie() {
        return conditieOptie;
    }

    public Vraag getVervolgVraag() {
        return vervolgVraag;
    }

    @Override
    public boolean isOpen() {
        return vervolgVraag.isOpen();
    }
}

class Enquête {
    private List<Vraag> vragen;

    public Enquête() {
        this.vragen = new ArrayList<>();
    }

    public void vraagToevoegen(Vraag vraag) {
        vragen.add(vraag);
    }

    public void uitvoeren() {
        Scanner scanner = new Scanner(System.in);
        List<String> antwoorden = new ArrayList<>();
        for (Vraag vraag : vragen) {
            if (vraag.isOpen()) {
                openVraagStellen(vraag);
                antwoorden.add(scanner.nextLine());
            } else {
                vraag.weergeven();
                String antwoord = scanner.nextLine();
                antwoorden.add(antwoord);
                if (vraag instanceof ConditioneleVraag && antwoord.equals(((ConditioneleVraag) vraag).getConditieOptie())) {
                    ((ConditioneleVraag) vraag).getVervolgVraag().weergeven();
                    antwoorden.add(scanner.nextLine());
                }
            }
        }
        scanner.close();
        antwoordenOpslaanNaarBestand(antwoorden);
    }

    private void openVraagStellen(Vraag vraag) {
        System.out.print(vraag.getVraagTekst() + " ");
    }

    private void antwoordenOpslaanNaarBestand(List<String> antwoorden) {
        try (FileWriter writer = new FileWriter("antwoorden.txt")) {
            for (int i = 0; i < antwoorden.size(); i++) {
                writer.write((i + 1) + ". " + antwoorden.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Enquête leesEnquêteVanBestand(String bestandsNaam) {
        Enquête enquête = new Enquête();
        try (BufferedReader reader = new BufferedReader(new FileReader(bestandsNaam))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String vraagTekst = line;
                if ((line = reader.readLine()) != null) {
                    List<String> opties = new ArrayList<>();
                    if (line.equals("open")) {
                        enquête.vraagToevoegen(new OpenVraag(vraagTekst));
                    } else if (line.equals("conditie")) {
                        String conditieOptie = reader.readLine();
                        String vervolgVraagTekst = reader.readLine();
                        enquête.vraagToevoegen(new ConditioneleVraag(vraagTekst, conditieOptie, new OpenVraag(vervolgVraagTekst)));
                    } else {
                        if (line.contains(",")) {
                            String[] optiesArray = line.split(",");
                            for (String optie : optiesArray) {
                                opties.add(optie.trim());
                            }
                        } else {
                            opties.add(line.trim());
                        }
                        enquête.vraagToevoegen(new MeerkeuzeVraag(vraagTekst, opties));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enquête;
    }
}

public class Vragenlijst {
    public static void main(String[] args) {
        Enquête enquête = Enquête.leesEnquêteVanBestand("vragen.txt");
        enquête.uitvoeren();
    }
}