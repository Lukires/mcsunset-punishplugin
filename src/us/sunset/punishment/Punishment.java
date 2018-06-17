package us.sunset.punishment;

public class Punishment 
{
	
	
	private PunishmentType type;
	private int duration;
	private String reason;
	
	public Punishment(PunishmentType type)
	{
		this(type, 0, type.name());
	}
	
	public Punishment(PunishmentType type, int duration)
	{
		this(type, duration, type.name());
	}
	
	public Punishment(PunishmentType type, String reason)
	{
		this(type, 0, reason);
	}
	
	public Punishment(PunishmentType type, int duration, String reason)
	{
		this.type=type;
		this.duration=duration;
		this.reason=reason;
	}
	
	
	
}
