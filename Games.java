public class Games implements Comparable<Games> {
    private String system;
    private String title;

    public Games(String system, String title) {
        this.system = system;
        this.title = title;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Games{" +
                "system='" + system + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Games o) {
        if (this.system == o.system) {
            return this.title.compareTo(o.title);
        }
        else{
            return this.system.compareTo(o.system);
        }

        }





}

