package pollution;

/**
 * Interface for anything in the pollution section whose progress can be tracked.
 * Any class that implements this MUST provide an updateStatus method.
 *
 * @author Sehej Muruvel
 */
public interface Trackable {

    // Changes the current status (e.g. Reported -> In Progress -> Resolved)
    void updateStatus(String s);
}
