
public class Person
{
	//person object

	private int stair_up;
	private int stair_down;
	private int time_spawned;
	private int time_deleted;
	
	//constructor
	public Person(Config config)
	{
		stair_up = Config.get_steps_per_floor_stairs_up();
		stair_down = Config.get_steps_per_floor_stairs_down();
		//time_spawned = ; //poisson distribution
	}

	

	///////////GETTERS///////////////////////
	public int get_floor_on()
	{

	}

	public int get_floor_off()
	{

	}

	public int get_stair_up()
	{
		return stair_up;
	}

	public int get_stair_down()
	{
		return stair_down;
	}



}