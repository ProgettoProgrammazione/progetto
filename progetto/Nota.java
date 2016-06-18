import java.util.*;

/** 
  * Classe astratta che definisce una nota nelle sue caratteristiche generali. 
  * Viene usata come base per costruire note di diversi tipi, attraverso 
  * sottoclassi che aggiungeranno ulteriori dati.
  *
  * @author Silvia Florio, Valeria Fedel, Davide Mariuzzi 
  */

public abstract class Nota {
  
  /* ----------------------------- ATTRIBUTI ----------------------------- */
  /** Contiene il numero identificativo della nota. */
  protected int id;
  /** Contiene la data della nota. */
  protected Date data;
  /** Contiene la stringa con il contenuto del file. */
  protected String contenuto;
  
  
  /* ---------------------------- COSTRUTTORE ---------------------------- */
  /**
    * Crea un oggetto di tipo Nota contenente le informazioni id e data.
    *
    * @param id    numero identificativo della nota.
    * @param data  la data di creazione o ultima modifica.
    */
  public Nota (int id, Date data) {
    this.id = id;
    this.data = data;
  }
  
  
  /* ------------------------------ METODI ------------------------------- */
  /** Ritorna l'id della nota. */
  public int getId () {
    return id;
  }
  
  /** Ritorna la data della nota. */
  public Date getData () {
    return data;
  }
  /** Metodo astratto che verrà implementato nelle sottoclassi. */
  abstract String getContenuto ();
  
}