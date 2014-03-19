import android.widget.Button;
import android.widget.TextView;
import com.odde.tennis.R;
import com.odde.tennis.Referee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class RefereeActivityTest {
    @Test
    public void display_Love_All_as_init_score(){
        Referee referee = Robolectric.buildActivity(Referee.class).create().get();
        TextView scoreView = (TextView) referee.findViewById(R.id.scoreView);
        assertEquals("Love All", scoreView.getText().toString());
    }

    @Test
    public void fifteen_love_after_player1_scores(){
        Referee referee = Robolectric.buildActivity(Referee.class).create().get();
        Button player1Score = (Button) referee.findViewById(R.id.player1Score);
        TextView scoreView = (TextView) referee.findViewById(R.id.scoreView);

        player1Score.performClick();

        assertEquals("Fifteen Love", scoreView.getText().toString());
    }
}
