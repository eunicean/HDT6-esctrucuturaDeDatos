
package project;

import java.util.HashMap;

import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Factory {

	public static Factory instance;
	public static Factory getInstance() {
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
	}
	
    public <E,T> Map <E,T> Getfactory(String hash) {

        if(hash == "hash"){

            return new HashMap();
        }

        else if(hash == "tree"){

            return new TreeMap();
        }

        else if(hash == "linked"){

            return new LinkedHashMap();
        }

        return null;
    }

    
}
