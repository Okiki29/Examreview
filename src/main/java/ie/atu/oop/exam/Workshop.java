package ie.atu.oop.exam;

    import java.util.HashSet;

    public class Workshop {
        private String workshopName;
        private int capacity;
        private HashSet<String> registeredIds;

        public Workshop(String workshopName, int capacity) {
            this.workshopName = workshopName;
            this.capacity = capacity;
            this.registeredIds = new HashSet<>();
        }

        public String getWorkshopName() { return workshopName; }
        public int getCapacity() { return capacity; }
    }

