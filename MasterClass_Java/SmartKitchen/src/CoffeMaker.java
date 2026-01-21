public class CoffeMaker {
        private boolean hasWorkToDo;

        public CoffeMaker() {
            this.hasWorkToDo = false;
        }

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void brewCoffee(){
            if(hasWorkToDo) {
                System.out.println("Haciendo café...");
                hasWorkToDo = false;
            }

        }
}
