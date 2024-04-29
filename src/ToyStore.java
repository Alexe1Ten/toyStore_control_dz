<<<<<<< HEAD

import java.util.List;
=======
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
>>>>>>> 6cdd7f24fbb1d1bbc251f74c745d96e773b9e8a0
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyStore {
<<<<<<< HEAD
    private PriorityQueue<List<Toy>> queue = new PriorityQueue<>();

    public void put(List<Toy> toys) {
=======
    private final PriorityQueue<ArrayList<Toy>> queue;

    public ToyStore() {
        queue = new PriorityQueue<>((t1, t2) -> t2.getFirst().getWeight() - t1.getFirst().getWeight());
    }

    public void put(ArrayList<Toy> toys) {
>>>>>>> 6cdd7f24fbb1d1bbc251f74c745d96e773b9e8a0
        this.queue.add(toys);
    }

    public Queue<List<Toy>> getQueue() {
        return queue;
    }

    public Toy getToy() throws IOException {
        if (!getQueue().isEmpty()) {
            Random random = new Random();
            Toy randomToy;
            randomToy = getQueue().element().remove(random.nextInt(getQueue().poll().size()));
            Logger logger = new Logger();
            logger.getLogger(randomToy);
            return randomToy;
        } else {
            return null;
        }

    }
    public void FileWriter(Toy ToyStore) throws IOException {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write("writer" + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The toy is: " + getToy().getWeight());
    }

}
