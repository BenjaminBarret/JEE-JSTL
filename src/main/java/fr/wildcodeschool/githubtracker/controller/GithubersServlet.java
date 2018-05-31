package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "GithubersServlet", urlPatterns = "/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Githuber> listGithubers =  new ArrayList<Githuber>();
        listGithubers.add(new Githuber("Benjamin","benjamin@gmail.com","BenBarret", "1", "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwihgpzE4a3bAhVJVhQKHcwGAKQQjRx6BAgBEAU&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D3uM6f3Kd5TU&psig=AOvVaw0hH1oQldk_b9gcpvUConOl&ust=1527780890480102"));
        listGithubers.add(new Githuber("pierre","cailloux@gmail.com","galet", "2","http://www.eberhartstonegroup.com/produits/zooms/produit_49_1.JPG"));
        listGithubers.add(new Githuber("valentin","valsuce@gmail.com","valentinAimeLaQueue","3","https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiHjazx4q3bAhUG0xQKHb6TADcQjRx6BAgBEAU&url=http%3A%2F%2Ffr.viadeo.com%2Ffr%2Fprofile%2Fvalentin.destruel&psig=AOvVaw1A6IYlTI1BTWTMx8ycFcCK&ust=1527781267653510"));

        request.setAttribute("maliste", listGithubers);
        this.getServletContext().getRequestDispatcher("/githubers.jsp").forward(request, response);
    }
}
