using System;
namespace CWindow
{
    public class windowHelper
    {


        public static bool Confirm(Window window, string mensagge){
            MessageDialog menssageDialog = new MessageDialog(
                   this,
                   DialogFlags.Modal,
                   MessageType.Question,
                   ButtonsType.YesNo,
                   "¿Quieres tomar algo?"
               );

            ResponseType response = (ResponseType)menssageDialog.Run();
            menssageDialog.Destroy();
        }
   
    }
}
