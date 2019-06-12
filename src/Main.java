
//Написать программу, перемешивающую и печатающую список карт в колоде.


public class Main {




        public static void main(String[] args) {

            String[] suits = {
                    "Spades", "Diamonds", "Hearts", "Clubs"
            };

            String[] rank = {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Jack", "Queen", "King", "Ace"
            };

            int n = suits.length * rank.length;





            String[] deck = new String[n];
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length*i + j] = rank[i] + " " + suits[j];
                }
            }


            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n-i));
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }


            for (int i = 0; i < deck.length; i++) {
                System.out.println(deck[i]);
            }
        }

    }

