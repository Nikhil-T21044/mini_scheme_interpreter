//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> "("
 * f1 -> "begin"
 * f2 -> ( Expression() )*
 * f3 -> ")"
 */
public class BeginExpression implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeListOptional f2;
   public NodeToken f3;

   public BeginExpression(NodeToken n0, NodeToken n1, NodeListOptional n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public BeginExpression(NodeListOptional n0) {
      f0 = new NodeToken("(");
      f1 = new NodeToken("begin");
      f2 = n0;
      f3 = new NodeToken(")");
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
