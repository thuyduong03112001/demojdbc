package dal;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;


public class ProductDAO extends DBContext{
    public List<Product> getAll(){
        List<Product> list = new ArrayList<>();
        String sql="select * from products";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet r = st.executeQuery();
           while(r.next()){
               Product p = new Product();
               p.setId(r.getString("id"));
               p.setName(r.getString("name"));
               p.setCatId(r.getString("cat_Id"));
               p.setImage(r.getString("image"));
               p.setPrice(r.getDouble("price"));
               p.setQuantity(r.getInt("quantity"));
               p.setDescribe(r.getString("describe"));
               p.setStatus(r.getString("status"));
               p.setAdddate(r.getDate("adddate"));
               list.add(p);
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public void delete(String id){
        String sql="delete from products where id=?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public Product ProductGetByID(String id){
        String sql="select * from products where id=?";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           st.setString(1, id);
           ResultSet r = st.executeQuery();
           if(r.next()){
               Product p = new Product();
               p.setId(r.getString("id"));
               p.setName(r.getString("name"));
               p.setCatId(r.getString("cat_Id"));
               p.setImage(r.getString("image"));
               p.setPrice(r.getDouble("price"));
               p.setQuantity(r.getInt("quantity"));
               p.setStatus(r.getString("status"));
               p.setDescribe(r.getString("describe"));
               p.setAdddate(r.getDate("adddate"));
               return p;
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
   
    public void insert(Product p){
        String sql="insert into products values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getId());
            st.setString(2, p.getName());
            st.setString(3, p.getCatId());
            st.setString(4, p.getImage());
            st.setDouble(5, p.getPrice());
            st.setInt(6, p.getQuantity());
            st.setString(7, p.getStatus());
            st.setString(8, p.getDescribe());
            st.setDate(9, p.getAdddate());
            st.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    //update
    public void update(Product p){
        String sql = "update products set name=?,cat_id= ?, image=?, price=?, "
                + "quantity=?, status=?, describe=?, adddate=? where id=?";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getName());
            st.setString(2, p.getCatId());
            st.setString(3, p.getImage());
            st.setDouble(4, p.getPrice());
            st.setInt(5, p.getQuantity());
            st.setString(6, p.getStatus());
            st.setString(7, p.getDescribe());
            st.setDate(8, p.getAdddate());
            st.setString(9, p.getId());
           st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        ProductDAO p = new ProductDAO();
        List<Product> ls = p.getAll();
        System.out.println(ls.get(0).getName());
    }
}
