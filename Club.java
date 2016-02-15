import java.util.ArrayList;
import java.util.Arrays;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    private ArrayList<Membership> members;
    private int[] miembrosPorMes;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
        miembrosPorMes = new int[12];
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        int mes = member.getMonth();
        miembrosPorMes[mes-1] = miembrosPorMes[mes-1] + 1;
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /** 
    * Calcula el numero de socios que se dieron de alta en un mes determinado. 
    * El año no nos importa. En caso de que el parametro contenga un valor 
    * no valido se muestra por pantalla el error.
    * @param month El mes en el que estamos interesados
    * @return El numero de socios que se dieron de alta dicho mes
    */
    public String joinedMonth(int month)
    {
        String miembros;
        if (month <= 12 && month >= 1){
             miembros = miembrosPorMes[month-1] + "";
        }
        else{
            miembros = "El número introduccido no corresponde con ningun mes.";
        }
        return miembros;
    }
}

