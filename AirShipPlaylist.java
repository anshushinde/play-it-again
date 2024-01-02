import java.util.ArrayList;
import java.util.Scanner;

public class AirShipPlaylist {
    public static void main(String[] args) {
        Movie theNotebook = new Movie("The Notebook", "Nick Cassavetes");
        theNotebook.setReleaseYear(2004);
        theNotebook.setPlot("A poor yet passionate young man (Ryan Gosling) falls in love with a rich young woman (Rachel McAdams), giving her a sense of freedom, but they are soon separated because of their social differences.");
        theNotebook.setRuntimeInMinutes(124);

        Movie spidermanHoco = new Movie("Spider-Man: Homecoming", "Jon Watts");
        spidermanHoco.setReleaseYear(2017);
        spidermanHoco.setPlot("Peter Parker balances his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New York City");
        spidermanHoco.setRuntimeInMinutes(133);

        Movie endgame = new Movie("Avengers: Endgame", "Antony and Joe Russo");
        endgame.setReleaseYear(2019);
        endgame.setPlot("After half of all life is snapped away by Thanos, the Avengers are left scattered and divided. Now with a way to reverse the damage, the Avengers and their allies must assemble once more and learn to put differences aside in order to work together and set things right.");
        endgame.setRuntimeInMinutes(182);

        Movie parasite = new Movie("Parasite", "Bong Joon-ho");
        parasite.setReleaseYear(2019);
        parasite.setPlot("Parasite tells the story of a poverty-stricken family, the Kims, who cunningly place themselves in the service of the Parks, an obscenely wealthy household who have been unknowingly harboring a stranger in their basement for years.");
        parasite.setRuntimeInMinutes(132);

        Movie dwd = new Movie("Don't Worry Darling", "Olivia Wilde");
        dwd.setReleaseYear(2022);
        dwd.setPlot("It tells the story of 1950s husband and wife Jack and Alice (Styles and Pugh), who live in a utopian experimental community named Victory. However, when Alice starts to worry that there could be more to Victory than meets the eye, some disturbing truths come to light.");
        dwd.setRuntimeInMinutes(123);

        Movie casinoRoyale = new Movie("Casino Royale", "Martin Campbell");
        casinoRoyale.setReleaseYear(2006);
        casinoRoyale.setPlot("Daniel Craig as James Bond: A British MI6 officer newly assigned 00 status, giving him a licence to kill. He is sent on a mission to arrest a bomb-maker in Madagascar, where he stumbles upon Le Chiffre's terrorist cell and is then sent to defeat him in a high-stakes poker game at Casino Royale.");
        casinoRoyale.setRuntimeInMinutes(144);

        Movie theGrandmother = new Movie("The Grandmother", "David Lynch");
        theGrandmother.setReleaseYear(1969);
        theGrandmother.setPlot("The Grandmother is a surrealist window into the very fabric of a decaying atomic family. For 33 minutes the viewer travels through every aching, terrible feeling of entrapment by one’s own kin, only to find solace in a grandparent soon to be taken away by the seasonal changes of life. ");
        theGrandmother.setRuntimeInMinutes(34);

        LinkedListMovie list = new LinkedListMovie();
        list.addNewHead(theNotebook);
        list.addNewTail(spidermanHoco);
        list.addNewTail(endgame);
        list.addNewTail(parasite);
        list.addNewTail(dwd);
        list.addNewTail(casinoRoyale);
        list.addNewTail(theGrandmother);

        System.out.println("Pick an option: \n 1: Print the Movie list\n" +
                "2: Print a plot for a specific movie\n" +
                "    - Get the name of the Movie you want the plot for\n" +
                "3: Print the total times for all movies\n" +
                "    - Time should be displayed in HH:MM:SS format\n" +
                "4: Print out the list of movies with options\n" +
                "    - Give the option to print the LinkedList in one of the following two alphabetical ways:\n" +
                "        - title\n" +
                "        - director\n" +
                "        - release date, ascending by year\nPrint 0 to quit program");
        Scanner user = new Scanner(System.in);
        int response = user.nextInt();
        user.nextLine();

        while (response != 0) {
            if (response == 1) {
                System.out.println(list);
            } else if (response == 2) {
                System.out.println("Which movie plot are you searching for? \n Press 1 for The Notebook \n Press 2 for SpiderMan Homecoming \n Press 3 for Avengers: Endgame " +
                        "\n Press 4 for Parasite \n Press 5 for Don't Worry Darling \n Press 6 for Casino Royale \n Press 7 for The Grandmother");
                int num = user.nextInt();
                user.nextLine();

                if (num == 1) {
                    Movie temp = (Movie) list.getHeadNode().getData();
                    System.out.println(temp.getPlot());
                } else if (num == 2) {
                    int currentIndex = 0;
                    Node currentNode = list.getHeadNode();
                    while (currentIndex < 1) {
                        currentNode = currentNode.getNext();
                        currentIndex++;
                    }

                    Movie temp = (Movie) currentNode.getData();
                    System.out.println(temp.getPlot());
                } else if (num == 3) {
                    int currentIndex = 0;
                    Node currentNode = list.getHeadNode();
                    while (currentIndex < 2) {
                        currentNode = currentNode.getNext();
                        currentIndex++;
                    }

                    Movie temp = (Movie) currentNode.getData();
                    System.out.println(temp.getPlot());
                } else if (num == 4) {
                    int currentIndex = 0;
                    Node currentNode = list.getHeadNode();
                    while (currentIndex < 3) {
                        currentNode = currentNode.getNext();
                        currentIndex++;
                    }

                    Movie temp = (Movie) currentNode.getData();
                    System.out.println(temp.getPlot());
                } else if (num == 5) {
                    int currentIndex = 0;
                    Node currentNode = list.getHeadNode();
                    while (currentIndex < 4) {
                        currentNode = currentNode.getNext();
                        currentIndex++;
                    }

                    Movie temp = (Movie) currentNode.getData();
                    System.out.println(temp.getPlot());
                } else if (num == 6) {
                    int currentIndex = 0;
                    Node currentNode = list.getHeadNode();
                    while (currentIndex < 5) {
                        currentNode = currentNode.getNext();
                        currentIndex++;
                    }

                    Movie temp = (Movie) currentNode.getData();
                    System.out.println(temp.getPlot());
                } else if (num == 7) {
                    int currentIndex = 0;
                    Node currentNode = list.getHeadNode();
                    while (currentIndex < 6) {
                        currentNode = currentNode.getNext();
                        currentIndex++;
                    }

                    Movie temp = (Movie) currentNode.getData();
                    System.out.println(temp.getPlot());
                }

            } else if (response == 3) {
                Node currentNode = list.getHeadNode();
                int currentNodeIndex = 0;
                while (currentNodeIndex < 7) {
                    Movie temp = (Movie) currentNode.getData();
                    int runtime = temp.getRuntimeInMinutes();
                    int hours = 0;
                    while ((runtime - 60) > 0) {
                        hours++;
                        runtime -= 60;
                    }
                    if (runtime >= 10) {
                        System.out.println("Runtime for " + temp.getTitle() + " is 0" + hours + ":" + runtime + ":00"); //fix display
                    } else {
                        System.out.println("Runtime for " + temp.getTitle() + " is 0" + hours + ":0" + runtime + ":00");
                    }
                    currentNode = currentNode.getNext();
                    currentNodeIndex++;
                }
            } else if (response == 4) {
                System.out.println("How would you like to alphabetize the LinkedList? By title (press 1), by director (press 2), or release date, ascending by year (press 3)");
                int order = user.nextInt();
                user.nextLine();
                System.out.println("This is the original list \n\n" + list);

                if (order == 1) {
                    ArrayList<String> names = new ArrayList<String>();
                    Node currentNode = list.getHeadNode();
                    int currentNodeIndex = 0;
                    while (currentNodeIndex < 7) {
                        Movie temp = (Movie) currentNode.getData();
                        names.add(temp.getTitle());
                        currentNode = currentNode.getNext();
                        currentNodeIndex++;
                    }


                    for (int i = 0; i < names.size() - 1; i++) {
                        for (int j = i + 1; j < names.size(); j++) {
                            if (names.get(i).compareTo(names.get(j)) > 0) {
                                String temp = names.get(j);
                                names.set(j, names.get(i));
                                names.set(i, temp);
                            }
                        }
                    }
                    System.out.println("This is a sorted list of movie names");
                    for (String name : names) {
                        System.out.println(name);
                    }
                } else if (order == 2) {
                    ArrayList<String> directors = new ArrayList<String>();
                    Node currentNode = list.getHeadNode();
                    int currentNodeIndex = 0;
                    while (currentNodeIndex < 7) {
                        Movie temp = (Movie) currentNode.getData();
                        directors.add(temp.getDirector());
                        currentNode = currentNode.getNext();
                        currentNodeIndex++;
                    }
                    for (int i = 0; i < directors.size() - 1; i++) {
                        for (int j = i + 1; j < directors.size(); j++) {
                            if (directors.get(i).compareTo(directors.get(j)) > 0) {
                                String temp = directors.get(j);
                                directors.set(j, directors.get(i));
                                directors.set(i, temp);
                            }
                        }
                    }
                    System.out.println("This is a sorted list of director names");

                    for (String director : directors) {
                        System.out.println(director);
                    }

                } else if (order == 3) {
                    ArrayList<Integer> years = new ArrayList<Integer>();
                    Node currentNode = list.getHeadNode();
                    int currentNodeIndex = 0;
                    while (currentNodeIndex < 7) {
                        Movie temp = (Movie) currentNode.getData();
                        years.add(temp.getReleaseYear());
                        currentNode = currentNode.getNext();
                        currentNodeIndex++;
                    }
                    for (int i = 0; i < years.size() - 1; i++) {
                        for (int j = i + 1; j < years.size(); j++) {
                            if (years.get(i).compareTo(years.get(j)) > 0) {
                                int temp = years.get(j);
                                years.set(j, years.get(i));
                                years.set(i, temp);
                            }
                        }
                    }
                    System.out.println("This is a sorted list of release years");

                    for (int year : years) {
                        System.out.println(year);
                    }

                }

            }

            System.out.println("Pick an option: \n 1: Print the Movie list\n" +
                    "2: Print a plot for a specific movie\n" +
                    "    - Get the name of the Movie you want the plot for\n" +
                    "3: Print the total times for all movies\n" +
                    "    - Time should be displayed in HH:MM:SS format\n" +
                    "4: Print out the list of movies with options\n" +
                    "    - Give the option to print the LinkedList in one of the following two alphabetical ways:\n" +
                    "        - title\n" +
                    "        - director\n" +
                    "        - release date, ascending by year\nPrint 0 to quit program");



            response = user.nextInt();
            user.nextLine();
        }

        System.out.println("bye bye");
    }
}
