package observer.simpleObserver.subject.concrete;

import observer.simpleObserver.subject.Subject;

public class ConcreteSubject extends Subject {
    private String subjectState;

    public ConcreteSubject(String subjectState) {
        this.subjectState = subjectState;
    }

    private String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    public String getState() {
        return this.getSubjectState();
    }
}
