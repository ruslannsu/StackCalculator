package commands;

import command_parser.exceptions.BadCountArgs;
import commands.exceptions.IncorrectConfigLogic;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class CommandMult extends Command{
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
        if (!Objects.equals(params.getFirst(), "no params")) {
            throw new BadCountArgs();
        }
        try {
            st.push(st.pop() * st.pop());
        }
        catch (Exception ex) {
            throw new IncorrectConfigLogic();
        }
    }
}
