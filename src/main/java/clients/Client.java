package clients;

public class Client {
    private String hash;
    private String name;
    private String email;

    public Client(String hash, String name, String email) {
        this.hash = hash;
        this.name = name;
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
