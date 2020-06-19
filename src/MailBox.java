import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * The class contains overridden method get()
 * logic of the get method for the Map received
 * when the element is missing differs from the logic of standard collections.
 * Reassign this logic to anonymous HashMap's successor.
 */
public class MailBox<V>
        extends LinkedHashMap<String, List<V>> {

    public MailBox() {

        super(new HashMap<String, List<V>>());

    }

    @Override
    public List<V> get(Object key) {

        ParameterizedType parameterizedType = (ParameterizedType) this.values().getClass().getGenericSuperclass();
        List list = setParametersList(parameterizedType);
        list = super.getOrDefault(key, list);
        return list;

    }

    private List setParametersList(ParameterizedType parameterizedType) {

        return ((Class) parameterizedType.getActualTypeArguments()[0]).toString().equals("String")
                ? new ArrayList<String>() : new ArrayList<Integer>();

    }

}