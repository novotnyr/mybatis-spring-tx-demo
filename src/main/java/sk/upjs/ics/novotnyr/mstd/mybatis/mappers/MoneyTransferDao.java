package sk.upjs.ics.novotnyr.mstd.mybatis.mappers;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyTransferDao {
	@Update("UPDATE \"account\" SET amount = amount + #{amount} WHERE owner = #{account}")
	public void addMoney(@Param("account") String account, @Param("amount") int amount);
	
	@Update("UPDATE \"account\" SET amount = amount - #{amount} WHERE owner = #{account}")
	public void removeMoney(@Param("account") String account, @Param("amount") int amount);	
	
	@Select("SELECT amount from \"account\" WHERE owner = #{account}")
	public int getAmount(@Param("account") String account);	
	
}
