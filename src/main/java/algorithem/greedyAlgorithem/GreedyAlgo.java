package algorithem.greedyAlgorithem;
import java.util.List;

public class GreedyAlgo {

    int currentLevel =0;
    final int maxLevel =3;
    SocialConnector sc;

    public GreedyAlgo(SocialConnector sConnector){

        this.sc = sConnector;
    }


    public long findMostFollowersPath(String account){

        long max =0;
        SocialUser toFollow=null;
        List<SocialUser> followers = sc.getFollowers(account);

        for(SocialUser su : followers){

            long followersCount = su.getFollowersCount();

            if(followersCount > max ){
                toFollow = su;
                max = followersCount;
            }
        }
        if(currentLevel < maxLevel -1){
            currentLevel++;
            max += findMostFollowersPath(toFollow.getUsername());
        }

        return max;
    }

    
}
