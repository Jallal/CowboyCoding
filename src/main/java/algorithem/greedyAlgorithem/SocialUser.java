package algorithem.greedyAlgorithem;

import java.util.ArrayList;
import java.util.List;

public class SocialUser {
    
    private String username;

    private List<SocialUser> followers;

    public String getUsername(){

        return this.username;
    }

    public List<SocialUser> getFollowers(){

        return this.followers;
    }

    @Override
    public boolean equals(Object obj) {
        
        return ((SocialUser) obj).getUsername().equals(username);
    }

    public SocialUser(String username) {

        this.username = username;
        this.followers = new ArrayList<>();
    }

    public SocialUser(String username, List<SocialUser> followers) {

        this.username = username;
        this.followers = followers;
    }

    public void addFollowers(List<SocialUser> followers) {

        this.followers.addAll(followers);
    }

    public long getFollowersCount(){

        return this.followers.size();
    }
}
