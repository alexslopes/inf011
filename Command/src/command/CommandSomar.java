/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import interfaces.Command;

/**
 *
 * @author aluno
 */
public class CommandSomar implements Command{
    private Receiver receiver;

    public CommandSomar(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void redo() {
      result = num1 + num2; 
    }

    @Override
    public void undo() {
      result = num1 - num2;
    }
    
}
