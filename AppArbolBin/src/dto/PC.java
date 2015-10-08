
package dto;

import java.util.Objects;

public class PC {
    private String ip;
    private String dominio;    

    public PC(String ip, String dominio) {
        this.ip = ip;
        this.dominio = dominio;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.ip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PC other = (PC) obj;
        if (!Objects.equals(this.ip, other.ip)) {
            return false;
        }
        return true;
    }
    
    
}
