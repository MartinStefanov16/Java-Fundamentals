package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> topics = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

//        List<String> topics = new ArrayList<>(Arrays.asList("Data Types", "Objects","Objects-Exercise", "Lists"));
//        System.out.println(topics);

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String command = input.split(":")[0];
            String topic = input.split(":")[1];



            switch (command) {
                case "Add":

                    if (!topics.contains(topic)) {
                        topics.add(topic);
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split(":")[2]);

                    if (!topics.contains(topic)) {
                        topics.add(index,topic);
                    }

                    break;
                case "Remove":
                    String potentialexerciseName = topic + "-Exercise";
                    if (topics.contains(topic) && topics.contains(potentialexerciseName)) {
                        topics.remove(topic);
                        topics.remove(potentialexerciseName);
                    } else if (topics.contains(topic)) {
                    topics.remove(topic);
                }
//                    if (topics.contains(topic)) {
//                        int topicIndex = topic.indexOf(topic);
//                        String potentialexerciseName = topic + "-Exercise";
//
//                        boolean hasExcer = topicIndex != topics.size() - 1 && topics.get(topicIndex + 1).equals(potentialexerciseName);
//                        topics.remove(topic);
//
//                        if (hasExcer) {
//                            topics.remove(potentialexerciseName);
//                        }
//                    }



                    break;
                case "Swap":
                    String topic2 = input.split(":")[2];
                    String exercise1 = topic + "-Exercise";
                    String exercise2 = topic2 + "-Exercise";

                    // check if both topics exist
                    //check if exer exists
                    // swap topics
                    // swap exer

                    int index1 = topics.indexOf(topic);
                    int index2 = topics.indexOf(topic2);

                    if (topics.contains(topic) && topics.contains(topic2)) {
                        topics.set(index1, topic2);
                        topics.set(index2, topic);
                    }
                    //////
                    if (topics.contains(exercise1)) {
                        topics.remove(exercise1);
                        if (topics.indexOf(topic) == topics.size() - 1) {
                            topics.add(exercise1);
                        } else {
                            topics.add(topics.indexOf(topic) +1,exercise1);
                        }
                    }
                    //
                    if (topics.contains(exercise2)) {
                        topics.remove(exercise2);
                        if (topics.indexOf(topic2) == topics.size() - 1) {
                            topics.add(exercise2);
                        } else {
                            topics.add(topics.indexOf(topic2) +1,exercise2);
                        }
                    }





                    break;
                case "Exercise":
                    String exerciseName = topic + "-Exercise";
                    //System.out.println(exerciseName);
                    // check if topic exists and if exer exists CHECK
                    // check if topic is last
                    // is last > just add exer
                    // if not last > add exer on topic + 1

                    if (topics.contains(topic)) {

                        if (!topics.contains(exerciseName)) {
                            //ADD EX
                            if (topics.indexOf(topic) == topics.size() -1) {
                                //last
                                topics.add(exerciseName);
                            } else {
                                topics.add(topics.indexOf(topic) + 1, exerciseName);
                            }
                        }

                    } else {
                        topics.add(topic);
                        topics.add(exerciseName);
                    }



                    break;
            }


            // debug
            //System.out.println(topics);

            input = scanner.nextLine();
        }

        int n = 1;
        for (String output : topics) {
            System.out.printf("%d.%s\n",n,output);
            n++;

        }



    }
}
