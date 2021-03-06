package cvm.sb.autonomic;

import cvm.sb.expression.ContextProvider;
import sb.base.autonomic.Symptom;

import java.util.Map;

public class SymptomOccurrence implements ContextProvider {
    private Symptom symptom;
    private Map<String, Object> values;

    public SymptomOccurrence(Symptom symptom, Map<String, Object> values) {
        this.symptom = symptom;
        this.values = values;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public Map<String, Object> getParams() {
        return values;
    }

    public Object getVariable(String name) {
        return getParams().get(name);
    }

}
