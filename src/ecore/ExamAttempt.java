/**
 */
package ecore;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam Attempt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.ExamAttempt#getDate <em>Date</em>}</li>
 *   <li>{@link ecore.ExamAttempt#getGrade <em>Grade</em>}</li>
 *   <li>{@link ecore.ExamAttempt#getElective <em>Elective</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getExamAttempt()
 * @model
 * @generated
 */
public interface ExamAttempt extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see ecore.EcorePackage#getExamAttempt_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link ecore.ExamAttempt#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(char)
	 * @see ecore.EcorePackage#getExamAttempt_Grade()
	 * @model
	 * @generated
	 */
	char getGrade();

	/**
	 * Sets the value of the '{@link ecore.ExamAttempt#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(char value);

	/**
	 * Returns the value of the '<em><b>Elective</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.Elective#getExamAttempts <em>Exam Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective</em>' container reference.
	 * @see #setElective(Elective)
	 * @see ecore.EcorePackage#getExamAttempt_Elective()
	 * @see ecore.Elective#getExamAttempts
	 * @model opposite="examAttempts" transient="false"
	 * @generated
	 */
	Elective getElective();

	/**
	 * Sets the value of the '{@link ecore.ExamAttempt#getElective <em>Elective</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective</em>' container reference.
	 * @see #getElective()
	 * @generated
	 */
	void setElective(Elective value);

} // ExamAttempt
