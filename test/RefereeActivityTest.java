import android.widget.Button;
import android.widget.TextView;
import com.odde.tennis.R;
import com.odde.tennis.Referee;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class RefereeActivityTest {

    private final Referee referee = Robolectric.buildActivity(Referee.class).create().get();
    private final Button player1Score = (Button) referee.findViewById(R.id.player1Score);
    private final TextView scoreView = (TextView) referee.findViewById(R.id.scoreView);

    @Test
    public void display_Love_All_as_init_score(){
        assertEquals("Love All", scoreView.getText().toString());
    }

    @Test
    public void fifteen_love_after_player1_scores(){
        player1Score.performClick();

        assertEquals("Fifteen Love", scoreView.getText().toString());
    }

    @Test
    public void Thirty_Love_after_player1_scores_twice(){
        player1Score.performClick();
        player1Score.performClick();

        assertEquals("Thirty Love", scoreView.getText().toString());
    }
}
