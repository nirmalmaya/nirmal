package com.servletcrud;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDao {
	public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=DBConnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from userdetails where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  

}
