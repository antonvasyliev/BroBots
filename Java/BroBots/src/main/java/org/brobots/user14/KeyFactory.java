package org.brobots.user14;

/**
 * Created by anton on 07.11.2016.
 */
public class KeyFactory {

    private Key key = new Key();

    public void setCypher(int cypher) {
        key.setCypher(cypher);
    }

    public Key getKey() {
        return key;
    }

}
