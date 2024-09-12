package config;

import org.hibernate.envers.RevisionListener;
import audit.revision;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){
        final revision revision = (revision)revisionEntity;
    }
}
