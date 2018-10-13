package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.*;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static { 
		try {
			AnnotationConfiguration config = new AnnotationConfiguration();			
			config.addAnnotatedClass(BazaEntity.class);
			config.addAnnotatedClass(CartaEntity.class);
			config.addAnnotatedClass(CartaJugadorEntity.class);
			config.addAnnotatedClass(CartaTiradaEntity.class);
			config.addAnnotatedClass(ChicoEntity.class);
			config.addAnnotatedClass(EnviteEntity.class);
			config.addAnnotatedClass(GrupoEntity.class);
			config.addAnnotatedClass(ItemRankingEntity.class);
			config.addAnnotatedClass(JuegoEntity.class);
			config.addAnnotatedClass(JugadorEntity.class);
			config.addAnnotatedClass(ManoEntity.class);
			config.addAnnotatedClass(MazoEntity.class);
			config.addAnnotatedClass(MovimientoEntity.class);
			config.addAnnotatedClass(ParejaEntity.class);
			config.addAnnotatedClass(PartidaEntity.class);
			config.addAnnotatedClass(PuntosParejaEntity.class);
			config.addAnnotatedClass(RankingEntity.class);
			
			sessionFactory = config.buildSessionFactory(); 
			
		} catch(Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static Session getSession() throws HibernateException {
	    	return sessionFactory.openSession();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}